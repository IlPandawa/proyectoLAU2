grammar gramPrestamo;

inicio: prestamo+;

prestamo:
    numeroPedido= INT COMMA
    codigoLibro= INT COMMA
    codigoUsuario= INT COMMA
    fechaSalida= DATE COMMA
    fechaMaxima= DATE COMMA
    fechaDevolucion= DATE{
        // Generación de RDF con base en los valores extraídos
        System.out.println("<rdf:Description rdf:about=\"#numeroPedido "+$codigoLibro.text+"\">");
        System.out.println("  <rdf:type rdf:resource=\"#Prestamo\" />");
        System.out.println("  <biblioteca:codigoLibro>"+$codigoLibro.text+"</biblioteca:codigoLibro>");
        System.out.println("  <biblioteca:codigoUsuario>"+$codigoUsuario.text+"</biblioteca:codigoUsuario>");
        System.out.println("  <biblioteca:fechaSalida>"+$fechaSalida.text+"</biblioteca:fechaSalida>");
        System.out.println("  <biblioteca:fechaMaxima>"+$fechaMaxima.text+"</biblioteca:fechaMaxima>");
        System.out.println("  <biblioteca:fechaDevolucion>"+$fechaDevolucion.text+"</biblioteca:fechaDevolucion>");
        System.out.println("</rdf:Description>\n");
      };

INT: ('0' ..'9')+;
DATE: INT  '/' INT  '/' INT;
COMMA: ',';
WS: (' ' | '\n' | '\t' | '\r')+ {$channel=HIDDEN; };