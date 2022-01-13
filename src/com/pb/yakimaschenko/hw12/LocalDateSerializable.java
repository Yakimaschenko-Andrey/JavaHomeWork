package com.pb.yakimaschenko.hw12;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class LocalDateSerializer extends StdSerializer<LocalDate> {

        private static final long serialVersionUID = 1L;

        public LocalDateSerializer(){
                super(LocalDate.class);
        }

        @Override
        public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider sp) throws IOException {
                gen.writeString(value.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
}

