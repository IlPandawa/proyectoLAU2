grammar gramLibro;

inicio: libro+;
libro: 
id = INT COMMA 
nombre = STRING COMMA 
editorial = STRING COMMA 
autor = STRING COMMA 
genero = STRING COMMA 
paisAutor = STRING COMMA 
numeroPaginas = INT COMMA 
anioEdicion = DATE COMMA
precio = DOUBLE {
        // Generación de RDF con base en los valores extraídos
        System.out.println("<rdf:Description rdf:about=\"#"+$id.text+"\">");
        System.out.println("  <rdf:type rdf:resource=\"#Libro\" />");
        System.out.println("  <biblioteca:codigoLibro>"+$id.text+"</biblioteca:codigoLibro>");
        System.out.println("  <biblioteca:nombreLibro>"+$nombre.text+"</biblioteca:nombreLibro>");
        System.out.println("  <biblioteca:editorial>"+$editorial.text+"</biblioteca:editorial>");
        System.out.println("  <biblioteca:autor>"+$autor.text+"</biblioteca:autor>");
        System.out.println("  <biblioteca:genero>"+$genero.text+"</biblioteca:genero>");
        System.out.println("  <biblioteca:paisAutor>"+$paisAutor.text+"</biblioteca:paisAutor>");
        System.out.println("  <biblioteca:numeroPaginas>"+$numeroPaginas.text+"</biblioteca:numeroPaginas>");
        System.out.println("  <biblioteca:anioEdicion>"+$anioEdicion.text+"</biblioteca:anioEdicion>");
        System.out.println("  <biblioteca:precioLibro>"+$precio.text+"</biblioteca:precioLibro>");
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