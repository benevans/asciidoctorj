package org.asciidoctor.extension;

import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.DocumentRuby;

public abstract class Treeprocessor extends Processor {

    public Treeprocessor() {
        this(new HashMap<String, Object>());
    }
    
    public Treeprocessor(Map<String, Object> config) {
        super(config);
    }

    public abstract void process(Document document);
    
    public void process(DocumentRuby documentRuby) {
    	process(document(documentRuby));
    }
    
}
