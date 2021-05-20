//Esta funcion se utiliza para eliminar el subarbol
function eliminarArbol(elemento){
	elemento.slideUp("slow",function() {	
		elemento.remove();
	});
}
//Es una funcion que recibe especies de un cultivo haciendo una peticion AJAX al servidor
function generarEspecies(lista,ide){
	$.getJSON(`http://localhost:8080/cultivo/${ide}`, function(respuesta){
		nestedList = $('<ul class="especies list-group"/>').insertAfter(lista)
		for (especie in respuesta){
			nestedList.append($('<li class="list-group-item">').append(
				$(`<div class="row ${especie} "/>`).append(
					$('<span class="especies col-10">')
						.html(`${respuesta[especie].nombreVulgar}, ${respuesta[especie].nombreCientifico}, <a href="${respuesta[especie].uRL}">${respuesta[especie].uRL}<a/>`)
				).append(
					$(`<span class="material-icons col-2 btn btn-light especies">`).attr('id', `${respuesta[especie].idEspecie}`).html("visibility")
			)))
		}//esta funcion muestra el subarbol si no está visible o lo oculta si lo está
		$(`.btn.especies`).click(function (){
		if($(this).hasClass("visible")){
			$(this).removeClass("visible");
			$(this).html("visibility");
			divUL =$(this).parent().parent().children('ul');	
			eliminarArbol(divUL)
		}
		else{
			$(this).addClass("visible");
			$(this).html("visibility_off");
			divPadre =$(this).parent();
			id = $(this).attr('id');
			console.log();
			generarPlagas(divPadre,id);				
		}
	})
		
	})
		
}