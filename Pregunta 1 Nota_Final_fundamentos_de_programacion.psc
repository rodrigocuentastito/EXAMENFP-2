Algoritmo Nota_final_fundamentos_de_programacion
	Escribir "Ingrese la cantidad de notas"
	Leer N
	acum <-0
	Para i<-1 Hasta N Hacer
		Escribir "Ingrese el dato:",i,":"
		Leer dato;
		acum<-acum+dato;		
		
	FinPara
	prom<-acum/N
	Escribir "La nota final es: ",prom 
	
	
FinAlgoritmo
