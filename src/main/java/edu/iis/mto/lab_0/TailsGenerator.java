package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

class TailsGenerator {

    List<String> tails(@NotNull String value) {
        List<String> output = new ArrayList<>();

        for (int i = 0; i < value.length() + 1; i++) {
            output.add(value.substring(i));
        }

        return Collections.unmodifiableList(output);
    }

}
