//Esta funcion se utiliza para eliminar el subarbol
function eliminarArbol(elemento){
	elemento.slideUp("slow",function() {		
		elemento.remove();
	});
}
//Es una funcion que recibe sustancias de una plaga haciendo una peticion AJAX al servidor
function generarSustanciasActivas(lista,ids){
	$.getJSON(`http://localhost:8080/plaga/${ids}`, function(respuesta){
			nestedList = $('<ul class="sustancias list-group"/>').insertAfter(lista)
			for (sustancia in respuesta){
				nestedList.append($('<li class="list-group-item">').append(
					$(`<div class="row ${sustancia} "/>`).append(
						$('<span class="sustancias col-10">')
							.html(`${respuesta[sustancia].nombre}`)
					).append(
						$(`<span class="material-icons col-2 btn btn-light sustancias">`).attr('id', `${respuesta[sustancia].idSustanciaActiva}`).html("visibility")
				)))
			}//esta funcion muestra el subarbol si no está visible o lo oculta si lo está
			$(`.btn.sustancias`).click(function (){
			if($(this).hasClass("visible")){
				try{
				$(this).removeClass("visible");
				$(this).html("visibility");
				divUL =$(this).parent().parent().children('ul');	
				eliminarArbol(divUL)
				}
				catch(err){
					console.error(err)
				}
			}
			else{
				try{
					$(this).addClass("visible");
				$(this).html("visibility_off");
				divPadre =$(this).parent();
				id = $(this).attr('id');
				generarProductos(divPadre,id);		
				}
				catch(err){
					console.error(err)
				}
						
			}
		})
			
		})
}