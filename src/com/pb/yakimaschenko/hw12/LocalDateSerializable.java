package com.pb.yakimaschenko.hw12;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateSerializable extends StdDeserializer<LocalDate> {

        private static final long serialVersionUID = 1L;

        protected LocalDateSerializable() {
                super(LocalDate.class);
        }


        @Override
        public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return LocalDate.parse(jp.readValueAs(String.class));
        }
}

