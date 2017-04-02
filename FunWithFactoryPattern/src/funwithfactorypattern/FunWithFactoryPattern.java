/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactorypattern;

import static funwithfactorypattern.be.EReader.HTML;
import static funwithfactorypattern.be.EReader.PDF;
import static funwithfactorypattern.be.EReader.TEXT;
import funwithfactorypattern.bll.factory.DocumentReaderFactory;
import funwithfactorypattern.bll.factory.IDocumentReaderFactory;
import funwithfactorypattern.bll.readers.IDocumentReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Adamino
 */
public class FunWithFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IDocumentReaderFactory documentFactory = new DocumentReaderFactory();

        IDocumentReader textReader = documentFactory.getReader(TEXT);
        IDocumentReader pdfReader = documentFactory.getReader(PDF);
        IDocumentReader htmlReader = documentFactory.getReader(HTML);

        List<String> texts = new ArrayList<>();
        texts.add(textReader.getAwesomeText());
        texts.add(pdfReader.getAwesomeText());
        texts.add(htmlReader.getAwesomeText());

        Iterator iter = texts.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
