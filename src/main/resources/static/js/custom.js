$(document)
		.ready(
				function() {
					var pos = $("#image").position(); // returns an object
					// with the attribute
					// top and left
					pos.top; // top offset position
					pos.left;
					console.log(pos.top + "   " + pos.left);
					var max_fields = 10; // maximum input boxes allowed
					var wrapper = $(".input_fields_wrap"); // Fields wrapper
					var add_button = $(".add_field_button"); // Add button ID

					let image = document.getElementById('image');
					let height = document.getElementById('height1');
					var width = document.getElementById('width1');

					height1.innerHTML += '<h1>height of image is :'
							+ image.clientHeight + 'px </h1>';

					width1.innerHTML += '<h1>width of image is :'
							+ image.clientWidth + 'px </h1>';

					AbsoluteCoordinates($("#image"));

					var x = 1; // initlal text box count
					$(add_button)
							.click(
									function(e) { // on add input button click
										e.preventDefault();
										var height = $('#height').val();
										var height11 = height;
										var width = $('#width').val();
										var width11 = parseInt(width) + 160;
										// alert(height +" "+ width);

										if (x < max_fields) { // max input box
											// allowed
											x++; // text box increment
											$(wrapper)
													.append(
															'<div><input type="text" style="position: absolute;top:'
																	+ height
																	+ 'px;left:'
																	+ width
																	+ 'px;" name="mytext[]"/><a href="#" style="position: absolute;top: '
																	+ height11
																	+ 'px;  left:'
																	+ width11
																	+ 'px;"  class="remove_field">Remove</a></div>'); // add
											// input
											// box
										}
									});

					$(wrapper).on("click", ".remove_field", function(e) { // user
						// click
						// on
						// remove
						// text
						e.preventDefault();
						$(this).parent('div').remove();
						x--;
					})
				});

$('#image').click(function(e) {

	let coords = document.getElementById('image').getBoundingClientRect();

	console.log(coords.left + "px");
	console.log(coords.bottom + "px");

	var offset = $(this).offset();
	var X = (e.pageX - offset.left);
	var Y = (e.pageY - offset.top);
	$('#coord').text('X: ' + X + ', Y: ' + Y);
});

function AbsoluteCoordinates($element) {
	var sTop = $(window).scrollTop();
	var sLeft = $(window).scrollLeft();
	var w = $element.width();
	var h = $element.height();
	var offset = $element.offset();
	var $p = $element;

	var pos = {
		left : offset.left + sLeft,
		right : offset.left + w + sLeft,
		top : offset.top + sTop,
		bottom : offset.top + h + sTop,
	}
	pos.tl = {
		x : pos.left,
		y : pos.top
	};
	pos.tr = {
		x : pos.right,
		y : pos.top
	};
	pos.bl = {
		x : pos.left,
		y : pos.bottom
	};
	pos.br = {
		x : pos.right,
		y : pos.bottom
	};
	console.log('left: ' + pos.left + ' - right: ' + pos.right + ' - top: '
			+ pos.top + ' - bottom: ' + pos.bottom);
	return pos;
}

/* Fill in the blank draggable */

function allowDrop(ev) {
	ev.preventDefault();
}
function drag(ev) {
	ev.dataTransfer.setData("Text", ev.target.id);
}
function drop(ev) {
	ev.preventDefault();
	var data = ev.dataTransfer.getData("Text");
	ev.target.parentNode.replaceChild(document.getElementById(data), ev.target);
	document.getElementById(data).className = "";
}

function enableQuestion() {
	event.preventDefault();

	var questionType = $('#qs').val();

	switch (questionType) {

	case "1":
		$('#fitbq').show();
		$('#mcq').hide();
		$('#dragfitbq').hide();
		$('#imgq').hide();
		break;

	case "2":
		$('#mcq').show();
		$('#fitbq').hide();
		$('#dragfitbq').hide();
		$('#imgq').hide();
		break;
	case "3":
		$('#dragfitbq').show();
		$('#mcq').hide();
		$('#fitbq').hide();
		$('#imgq').hide();
		break;
	case "4":
		$('#imgq').show();
		$('#dragfitbq').hide();
		$('#mcq').hide();
		$('#fitbq').hide();
		break;
	}
}