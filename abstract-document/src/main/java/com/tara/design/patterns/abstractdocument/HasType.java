package com.tara.design.patterns.abstractdocument;

import java.util.Optional;

public interface HasType extends Document{
    String PROPERTY = "type";
    default Optional<String> getType(){
        return Optional.ofNullable((String)get(PROPERTY));
    }
}
