grammar T2;

inicio: creacion usar tabla+ cerrar;

creacion:
	CREAR ID {System.out.println("CREATE DATABASE "+$ID.text); 
                    };

usar: USAR ID {System.out.println("USE DATABASE "+$ID.text); };

// tabla : TABLA ID INICIO {} campo+ FIN {};

tabla:
	TABLA ID INICIO { 
                    //código para generar SQL
      System.out.println("CREATE TABLE "+$ID.text ); 
      System.out.println(" ("+$ID.text+"_key INTEGER AUTOINCREMENT NOT NULL"); 
                     //código para crear estructura de datos
                       
                     //
                   } campo+ FIN {
                     System.out.println("   );   "); 
                  };

campo:
	ID (t = NUMERICO | t = ALFABETICO | t = FECHA) { //aquí hay que agregar código para generar SQL
                    if(($t.text).compareTo("letras")==0) 
                       System.out.println(", "+$ID.text + " VARCHAR(300)" ); 
                    else if(($t.text).compareTo("numeros")==0) 
                       System.out.println(", "+$ID.text + " INTEGER" ); 
                    else if(($t.text).compareTo("fecha")==0) 
                       System.out.println(", "+$ID.text + " DATE" ); 
                    else
                       System.out.println(", "+$ID.text + " " +$t.text );  
                };

cerrar: CERRAR;
CERRAR: 'cerrar';
NUMERICO: 'numeros';
ALFABETICO: 'letras';
FECHA: 'fecha';
TABLA: 'tabla';
INICIO: 'inicio';
FIN: 'fin';
USAR: 'usar';
CREAR: 'crear';
ID: ('a' ..'z' | 'A' ..'Z' | '_') (
		'a' ..'z'
		| 'A' ..'Z'
		| '0' ..'9'
		| '_'
	)*;
WS: (' ' | '\n' | '\t' | '\r')+ {$channel=HIDDEN; };