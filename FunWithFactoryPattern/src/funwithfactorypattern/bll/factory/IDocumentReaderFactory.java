/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactorypattern.bll.factory;

import funwithfactorypattern.be.EReader;
import funwithfactorypattern.bll.readers.IDocumentReader;

public interface IDocumentReaderFactory {

    public IDocumentReader getReader(EReader protocol);

}
