package designpatterns.structionaldesignpatterns.bridge.bridgetestdemo3;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);

}
