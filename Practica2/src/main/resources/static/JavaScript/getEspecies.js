
function eliminarArbol(elemento){
	elemento.slideUp("slow",function() {		
		elemento.remove();
	});
}

function generarEspecies(lista,id){
	console.log(lista)
	$.getJSON(`http://localhost:8080/cultivo/${id}`, function(respuesta){
			nestedList = $('<ul class=" list-group"/>').insertAfter(lista)
			for (especie in respuesta){
				nestedList.append($('<li class="list-group-item">').append(
					$(`<div class="row ${especie} "/>`).append(
						$('<span class="especies col-10" id="a">')
							.html(respuesta[especie].nombreVulgar)
					).append(
						$(`<span class="material-icons col-2 btn btn-light">`).attr('id', `${respuesta[especie].idEspecie}`).html("visibility")
				)))
			}
			/*
			$(`.btn`).click(function (){
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
				generarEspecies(divPadre,id);				
			}
		})*/
			
		})
}