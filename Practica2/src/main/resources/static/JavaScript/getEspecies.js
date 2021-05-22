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
				//para que la clase sea única la vamos a identificar con el id de esta especie en concreto
				//y además el cultivo predecesor
				$(`<div class="row  ${respuesta[especie].idEspecie}_${ide}"/>`).append(
					$('<span class="especies col-10">')
						.html(`<span class="texto"> ${respuesta[especie].nombreVulgar}<span/>
						<a href="${respuesta[especie].uRL}">${respuesta[especie].uRL}<a/>`)
				).append(
					$(`<span class="material-icons col-2 btn btn-light ${respuesta[especie].idEspecie}_${ide}">`).attr('id', `${respuesta[especie].idEspecie}`).html("visibility")
			)))
			$(`.${respuesta[especie].idEspecie}_${ide}`).children('.especies').children('.texto')
			.easyTooltip({
				content: `<span>${respuesta[especie].nombreCientifico}<span/>`
			});
		
		$(`.btn.${respuesta[especie].idEspecie}_${ide}`).click(function (){
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
			console.log(id);
			generarPlagas(divPadre,id);				
		}
		})
		}
	})
		
}