(function() {

	$(document).ready(fnInit);

	function fnInit() {

		var arrData = {
			category : 'Funny'
		};

		$.ajax({
			url : 'TwiiterServlet',
			data : arrData,
			success : function(objResponse) {
				console.log(objResponse);
			}
		});

	}

})();
