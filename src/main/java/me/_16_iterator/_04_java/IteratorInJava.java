package me._16_iterator._04_java;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IteratorInJava {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        Board board = new Board();
        board.addPost("design patter");
        board.addPost("algorithm");
        board.addPost("data structure");

        board.getPosts().iterator().forEachRemaining(p -> System.out.println(p.getTitle()));

        // StAX - Streaming API for XML console 기반의 api
        // SAX - Simple API for XML 읽기 전용 api
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("Book.xml"));
        while (xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.nextEvent();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                QName name = startElement.getName();
                if (name.getLocalPart().equals("book")) {
                    Attribute title = startElement.getAttributeByName(new QName("title"));
                    System.out.println(title.getValue());
                }
            }
        }
    }
}
