//Es una funcion que recibe productos de una sustancia haciendo una peticion AJAX al servidor
function generarProductos(lista,idp){
	$.getJSON(`http://localhost:8080/sustanciaActiva/${idp}`, function(respuesta){
			nestedList = $('<ul class="productos list-group"/>').insertAfter(lista)
			for (prod in respuesta){
				nestedList.append($('<li class="list-group-item">').append(
					$(`<div class="row ${prod} "/>`).append(
						$('<span class="productos col">')
							.html(`${respuesta[prod].nombre}, <a href="${respuesta[prod].uRL}">${respuesta[prod].uRL}<a/>`)
					)))
			}
		})
}