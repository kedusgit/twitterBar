(function() {

	$(document).ready(fnInit);

	function fnInit() {

		$(".menu-item").click(function(event) {
			$(".menu-item").removeClass('active');
			$(this).addClass('active');
			
			var strCategory = $(this).attr('data-category');
			
			getTwits(strCategory);
			
		});

		

	}
	
	function getTwits( strCategory ) {
		
		var arrData = {
				category : strCategory
			};

			$.ajax({
				url : 'TwitterByCategory',
				data : arrData,
				dataType: 'json',
				success : function(objResponse) {
					
					console.log(objResponse);
					
					var htmlResult = "";
					
					$(objResponse).each(function(index,item){
						htmlResult += fnDrawTwit(item);
					});

					$("#twits-container").html(htmlResult);
					
				}
			});
		
	}
	
	function fnDrawTwit(item){
		
		htmlTwit = "<div class='col-xs-12 col-sm-6 col-md-3'>";
		htmlTwit += "<div class='twit'>";
		htmlTwit += item.twit;
		htmlTwit += "</div>";
		htmlTwit += "</div>";
		
		return htmlTwit;
	}

})();
