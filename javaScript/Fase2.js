
	function funcionFase2(){

	const b5=5, b10=10, b20=20, b50=50, b100=100, b200=200, b500=500;
	var totalb=0, dish=[""], price=[0];
	
	//Crear Menu
	alert("Crear Menu");
	for (var i=0;i<3;i++){
		dish[i]=prompt('Ingrese el plato'+(i+1) + ":"); 
		price[i]=prompt('Ingrese el precio de '+dish[i]+ ":"); 
		
		while(isNaN(price[i])){// "NaN" cuando se presiona barra espaciadora o no se introduce dato
			price[i]=prompt("El precio debe ser un numero entero.\n Ingrese el precio de " +dish[i] + ":")
		}
	}   	
	
	//Mostrar Menu
	
	var menu="";
	for (var i=0;i<dish.length;i++){
			menu+= dish[i]  + " --------------------------------- "+ price[i] + "<br>";
	}
	document.getElementById('show1').innerHTML = "<b>Menu</b> <br><br>" + menu;
	
	
	//Elegir platos	
	
	var count=0, nextOrder=1, order=[""];
	alert("Inciar pedido");
	while(nextOrder==1){
		order[count]=prompt("Elige plato");
		nextOrder=parseInt(prompt("Desea continuar? 1:Si / 0:No"));
		while( nextOrder !=1 && nextOrder!=0){
			nextOrder=parseInt(prompt("Opcion no valida. \n Digite 1 (para continuar), 0 (para finalizar pedido)"));
		}
		count++;
	}
}	
