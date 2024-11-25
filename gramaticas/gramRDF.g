grammar gramRDF;

inicio: creacion clase+ cerrar;

creacion: 
    CREAR ID {
        System.out.println("<?xml version=\"1.0\"?>");
        System.out.println();
        System.out.println("<!DOCTYPE rdf:RDF [<!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\">]>");
        System.out.println();
        System.out.println("<rdf:RDF ");
        System.out.println("     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"");
        System.out.println("     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"");
        System.out.println("     xmlns:"+$ID.text+"=\"http://www.proyecto.com/"+$ID.text+"#\"");
        System.out.println("     xml:base=\"http://www.proyecto.com/"+$ID.text+"#\">");
        System.out.println();
        System.out.println("<!-- Clases de la biblioteca -->");
    };

clase:
    TABLA ID inicioPropiedad finPropiedad {
        System.out.println("<rdfs:Class rdf:about=\"http://www.proyecto.com/biblioteca#"+$ID.text+"\"/>");
    };

inicioPropiedad:
    INICIO (propiedad)+;

propiedad:
    ID t=(NUMERICO|ALFABETICO|FECHA) {
        System.out.println("<!-- Propiedad: "+$ID.text+" -->");
        System.out.println("<rdf:Property rdf:about=\"#"+$ID.text+"\">");
        System.out.println("    <rdfs:domain rdf:resource=\"#"+$ID.getText()+"\"/>");

        if ($t.text.equals("numeros")) {
            System.out.println("    <rdfs:range rdf:resource=\"&xsd;integer\"/>");
        } else if ($t.text.equals("letras")) {
            System.out.println("    <rdfs:range rdf:resource=\"&xsd;string\"/>");
        } else if ($t.text.equals("fecha")) {
            System.out.println("    <rdfs:range rdf:resource=\"&xsd;date\"/>");
        }

        System.out.println("</rdf:Property>");
    };

finPropiedad: FIN;

cerrar:
    CERRAR {
        System.out.println("</rdf:RDF>");
    };

// Tokens
CERRAR: 'cerrar';
NUMERICO: 'numeros';
ALFABETICO: 'letras';
FECHA: 'fecha';
TABLA: 'tabla';
INICIO: 'inicio';
FIN: 'fin';
CREAR: 'crear';
ID: ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
WS: (' ' | '\n' | '\t' | '\r')+ {$channel=HIDDEN;};