
function generarProductos(lista,idp){
	$.getJSON(`http://localhost:8080/sustanciaActiva/${idp}`, function(respuesta){
			nestedList = $('<ul class="productos list-group"/>').insertAfter(lista)
			for (prod in respuesta){
				nestedList.append($('<li class="list-group-item">').append(
					$(`<div class="row ${prod} "/>`).append(
						$('<span class="productos col">')
							.html(respuesta[prod].nombre, respuesta[prod].URL)
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
				generarSustanciasActivas(divPadre,id);				
			}
			
		})
			*/
		})
}