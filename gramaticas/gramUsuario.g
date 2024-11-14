grammar gramUsuario;

inicio: usuario+;

usuario: 
    id = INT COMMA
    nombre = STRING COMMA
    apellido = STRING (STRING+)? COMMA
    INE = INT COMMA
    domicilio= STRING (STRING+)? COMMA
    estado = STRING (STRING+)? COMMA
    municipio = STRING (STRING+)? COMMA
    nacimiento= DATE{
        // Generación de RDF con base en los valores extraídos
        System.out.println("<rdf:Description rdf:about=\"#"+$id.text+"\">");
        System.out.println("    <rdf:type rdf:resource=\"#Usuario\" />");
        System.out.println("    <biblioteca:codigoUsuario>"+$id.text+"</biblioteca:codigoUsuario>");
        System.out.println("    <biblioteca:nombre>"+$nombre.text+"</biblioteca:nombre>");
        System.out.println("    <biblioteca:apellidos>"+$apellido.text+"</biblioteca:apellidos>");
        System.out.println("    <biblioteca:noIdentificacion>"+$INE.text+"</biblioteca:noIdentificacion>");
        System.out.println("    <biblioteca:domicilio>"+$domicilio.text+"</biblioteca:domicilio>");
        System.out.println("    <biblioteca:estado>"+$estado.text+"</biblioteca:estado>");
        System.out.println("    <biblioteca:municipio>"+$municipio.text+"</biblioteca:municipio>");
        System.out.println("    <biblioteca:nacimiento>"+$nacimiento.text+"</biblioteca:nacimiento>");
        System.out.println("</rdf:Description>\n");
      }; 

INT: ('0' ..'9')+;
DOUBLE: INT '.' INT;
STRING: ('a' ..'z' | 'A' ..'Z' | '_') (
		'a' ..'z'
		| 'A' ..'Z'
		| '_'
		| '0' ..'9' 
    | ' '
	)*;
DATE: INT  '/' INT  '/' INT;
COMMA: ',';
WS: (' ' | '\n' | '\t' | '\r')+ {$channel=HIDDEN; };