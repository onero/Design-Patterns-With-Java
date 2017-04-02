/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactorypattern.bll.readers;

public class PDFReader implements IDocumentReader {

    @Override
    public String getAwesomeText() {
        return "I am a PDF reader";
    }

}
