package simcir;

import com.d_project.xml.*;

import java.io.*;
import java.net.*;

/**
 * CircuitDocument
 * @author Kazuhiko Arase
 */
class CircuitDocument extends Document {

    public CircuitDocument(Element top) {
	super(top);
    }

    public CircuitDocument(URL url) throws IOException {
	this(url.openStream() );
    }

    public CircuitDocument(InputStream is) throws IOException {
	super(new ParseReader(new BufferedReader(new InputStreamReader(is) ) ) );//url.openStream() ) ) );
    }


    public void write(ParseWriter writer) throws IOException {
	writer.write("<!-- SIMCIR 1.2.1 -->");
	writer.newLine();
	writer.write("<!-- Don't edit this file. -->");
	writer.newLine();
	super.write(writer);
    }
}

