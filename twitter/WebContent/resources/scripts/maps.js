function initMap() {

	var myLatlng = {
		lat : 40.7066061,
		lng : -74.0940532
	};

	var map = new google.maps.Map(document.getElementById('map'), {
		zoom : 12,
		center : myLatlng
	});

	var timeout = null;

	map.addListener('center_changed', function() {

		if (timeout != null) {
			return;
		}

		timeout = window.setTimeout(function() {
			timeout = null;
			getTweets(map);
		}, 500);

	});
	
	getTweets(map);

}

function getTweets(map) {

	$("#tweets").html("");

	var objPosition = map.getCenter();

	var arrData = {
		lat : objPosition.lat(),
		lng : objPosition.lng(),
	};

	$.ajax({
		url : 'TwitterByLocation',
		data : arrData,
		dataType : 'json',
		success : function(objResponse) {

			$.each(objResponse, function(index, objTweet) {

				if (objTweet.latitude != null) {

					var tweetLatlng = {
						lat : objTweet.latitude,
						lng : objTweet.longitude
					};

					var marker = new google.maps.Marker({
						position : tweetLatlng,
						map : map,
						title : objTweet.name
					});
				}

			});

			$.each(objResponse, function(index, item) {
				$("#tweets").append(fnDrawTweet(item));
			});

		}
	});

}

function fnDrawTweet(item) {

	htmlTweet = "<div class='row' >"
	htmlTweet += "<div class='col-xs-12 col-sm-12 col-md-12'>";

	htmlTweet += "<div class='tweet' " + "data-url=" + item.url
	"+' >";

	htmlTweet += "<div class='profile_pic' > <a href='" + item.url
			+ "' target='_blank' ><img src='" + item.profile_pic
			+ "' alt='' /></a></div>";

	htmlTweet += "<div class='name'>" + item.name + "</div>";
	htmlTweet += "<div class='location'>" + item.location + "</div>";
	htmlTweet += "<div class='tweet_content'> <a href='" + item.url
			+ "' target='_blank' >" + item.tweet_content + "</a></div>";
	htmlTweet += "</div>";
	htmlTweet += "</div>";
	htmlTweet += "</div>";

	return htmlTweet;
}