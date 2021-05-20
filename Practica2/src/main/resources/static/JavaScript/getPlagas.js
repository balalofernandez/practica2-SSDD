
function eliminarArbol(elemento){
	elemento.slideUp("slow",function() {
		elemento.remove();
	});
}

function generarPlagas(lista,idpl){
	$.getJSON(`http://localhost:8080/especie/${idpl}`, function(respuesta){
			nestedList = $('<ul class="plagas list-group"/>').insertAfter(lista)
			for (plaga in respuesta){
				nestedList.append($('<li class="list-group-item">').append(
					$(`<div class="row ${plaga} "/>`).append(
						$('<span class="plagas col-10">')
							.html(`${respuesta[plaga].nombreVulgar}, ${respuesta[plaga].nombreCientifico}, <a href="${respuesta[plaga].uRL}">${respuesta[plaga].uRL}<a/>`)
					).append(
						$(`<span class="material-icons col-2 btn btn-light plagas">`).attr('id', `${respuesta[plaga].idPlaga}`).html("visibility")
				)))
			}
			$(`.btn.plagas`).click(function (){
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
				generarSustanciasActivas(divPadre,id);				
			}
		})
			
		})
}