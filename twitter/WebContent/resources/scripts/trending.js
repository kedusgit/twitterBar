(function() {

	$(document).ready(fnInit);

	function fnInit() {

		var count = 1;

		$(window).scroll(
				function() {
					if ($(window).scrollTop() == $(document).height()
							- $(window).height()) {
						count++;
						getTweets(count);
					}
				});

		fnGetTrending();

		$("#selTrending").change(function() {
			count = 1;
			getTweets(count);
		});

	}

	function fnGetTrending() {

		$.ajax({
			url : 'TweetTrends',
			dataType : 'json',
			success : function(objResponse) {

				$(objResponse).each(function(index, item) {
					$("#selTrending").append($('<option>', {
						value : item.name,
						text : item.name
					}));
				});
			}
		});

	}

	function getTweets(intPage) {

		if (intPage == 1) {
			$("#twits-container").html("");
		}

		var strTrend = $("#selTrending").val();

		if (strTrend == false) {
			return;
		}

		var arrData = {
			trend : strTrend,
			page : intPage
		};

		$.ajax({
			url : 'TweetsByTrend',
			type : 'POST',
			data : arrData,
			dataType : 'json',
			cache : false,
			success : function(objResponse) {

				$(objResponse).each(function(index, item) {
					$("#twits-container").append(fnDrawTweet(item));
				});

			}
		});

	}

	function fnDrawTweet(item) {

		htmlTwit = "<div class='col-xs-12 col-sm-6 col-md-4'>";

		htmlTwit += "<div class='tweet' " + "data-url=" + item.url + "' >";

		htmlTwit += "<div class='profile_pic' > <a href='" + item.url
				+ "' target='_blank' ><img src='" + item.profile_pic
				+ "' alt='' /></a></div>";

		htmlTwit += "<div class='name'>" + item.name + "</div>";
		htmlTwit += "<div class='tweet_content'> <a href='" + item.url
				+ "' target='_blank' >" + item.tweet_content + "</a></div>";
		htmlTwit += "<div class='location'>" + item.location + "</div>";
		htmlTwit += "</div>";
		htmlTwit += "</div>";

		return htmlTwit;
	}

	jQuery(document)
			.ready(
					function($) {

						function loadArticle(pageNumber) {
							$('a#inifiniteLoader').show('fast');
							$
									.ajax({
										url : "<?php bloginfo('wpurl') ?>/wp-admin/admin-ajax.php",
										type : 'POST',
										data : "action=infinite_scroll&page_no="
												+ pageNumber
												+ '&loop_file=loop',
										success : function(html) {
											$('a#inifiniteLoader').hide('1000');
											$("#content").append(html); // This
											// will
											// be
											// the
											// div
											// where
											// our
											// content
											// will
											// be
											// loaded
										}
									});
							return false;
						}

					});

})();
