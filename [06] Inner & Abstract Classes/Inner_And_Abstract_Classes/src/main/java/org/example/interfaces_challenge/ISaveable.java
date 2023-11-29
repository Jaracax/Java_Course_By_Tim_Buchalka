package org.example.interfaces_challenge;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
