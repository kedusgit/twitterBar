(function() {

	$(document).ready(fnInit);

	function fnInit() {

		$(".menu-item").click(function(event) {
			$(".menu-item").removeClass('active');
			$(this).addClass('active');

			var strCategory = $(this).attr('data-category');

			setDefaultCategory(strCategory);
			getTwits(strCategory);

		});

		fnRestoreStatus();

	}

	function fnRestoreStatus() {

		var strCategory = getDefaultCategory();

		if (strCategory == null) {
			strCategory = "romance";
		}

		$(".menu-item").each(function(index, item) {
			if ($(this).attr('data-category') == strCategory) {
				$(this).addClass('active');
			}
		});

		getTwits(strCategory);

	}

	function setDefaultCategory(strCategory) {
		localStorage.setItem("category", strCategory);
	}

	function getDefaultCategory() {
		return localStorage.getItem("category");
	}

	function getTwits(strCategory) {

		if (strCategory == false) {
			return;
		}

		var arrData = {
			category : strCategory
		};

		$.ajax({
			url : 'TwitterByCategory',
			data : arrData,
			dataType : 'json',
			success : function(objResponse) {

				var htmlResult = "";

				$(objResponse).each(function(index, item) {
					htmlResult += fnDrawTwit(item);
				});

				$("#twits-container").html(htmlResult);

			}
		});

	}

	function fnDrawTwit(item) {

		htmlTwit = "<div class='col-xs-12 col-sm-6 col-md-3'>";

		htmlTwit += "<div class='tweet' " + "data-url=" + item.url
		"+' >";

		htmlTwit += "<div class='profile_pic > <a href='" + item.url
				+ "' target='_blank' ><img src='" + item.profile_pic
				+ "' alt=''></a></div>";

		htmlTwit += "<div class='name'>" + item.name + "</div>";
		htmlTwit += "<div class='location'>" + item.location + "</div>";
		htmlTwit += "<div class='tweet_content'> <a href='" + item.url
				+ "' target='_blank' >" + item.tweet_content + "</a></div>";
		htmlTwit += "</div>";
		htmlTwit += "</div>";

		return htmlTwit;
	}

})();
