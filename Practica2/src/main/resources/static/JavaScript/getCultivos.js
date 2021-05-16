$(function() {
	
function expandirArbol(){
	var toggler = document.getElementsByClassName("caret");
	var i;
	for (i = 0; i < toggler.length; i++) {
	  toggler[i].addEventListener("click", function() {
		console.log("Aqui");
	    $(".nested").show();
	    this.classList.toggle("caret-down");
		});
}}

var url_cultivos ='http://localhost:8080/cultivos';
var url_especies ='http://localhost:8080/especies';

$.getJSON(url_cultivos,

     function(respuesta) {
        lista =$('#ArbolLista');
		for (cultivo in respuesta){
			/*lista.append($('li')
				.html(<span class="caret caret-arrow-down"></span>)
				.html(respuesta[cultivo].nombre)
			);*/
			lista.append($('<li/>').append($('<span class="cultivos caret caret-arrow-down" id="a">').html(respuesta[cultivo].nombre)));
		
		   /*lista.append($('<h3/>').html('Reparto'));
		   for (actor in respuesta[pelicula].reparto) {
		      lista.append($('<p>').html(respuesta[pelicula].reparto[actor].nombre));
	       }*/
		}
		
		$('.cultivos').click(function(){
		$.getJSON(url_especies, function(respuesta){
			lista = $('.cultivos');
			nestedList = $('<ul class="nested"/>').insertAfter(lista)
			//lista.append($('<ul class="nested"/>').html("prueba"))
			
			for (especie in respuesta){
				nestedList.append($('<li/>').append($('<span class="especies caret caret-arrow-down">').html(respuesta[especie].nombreVulgar)));
		
			}
			//lista.append($('<li/>').append($('<span class="cultivos caret caret-arrow-down">').html(respuesta[cultivo].nombre)));
		
		})
		})
		expandirArbol();
  });
});
