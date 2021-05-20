$(function() {
//Esta funcion se utiliza para eliminar el subarbol
function eliminarArbol(elemento){
	elemento.slideUp("slow",function() {	
		elemento.remove();
	});
}



var url_cultivos ='http://localhost:8080/cultivos';

$.getJSON(url_cultivos,
	//Es una funcion que recibe cultivos haciendo una peticion AJAX al servidor
     function(respuesta) {
        lista =$('#ArbolLista');
		for (cultivo in respuesta){
			lista.append($('<li class ="list-group-item">').append(
				$(`<div class="row ${cultivo} "/>`).append(
					$('<span class="cultivos col-10">')
						.html(`${respuesta[cultivo].nombre}`)
				).append(
					$(`<span class="material-icons col-2 btn btn-light cultivos">`).attr('id', `${respuesta[cultivo].idcultivo}`).html("visibility")
				)))
			
		} //esta funcion muestra el subarbol si no está visible o lo oculta si lo está
		$(`.btn.cultivos`).click(function (){
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
		})
		
		
  });
});
