package com.example.nightbringer.logicsysytem.validate;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.nightbringer.logicsysytem.annotate.Value;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Nightbringer on 6/7/2018.
 */

public class Validate {
    private List<Boolean> list;

    public Validate() {
        list = new ArrayList<>();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public List validation(Object object) {

        if (Objects.nonNull(object)) {
            Class vClass = object.getClass();
            Field[] field = vClass.getFields();
            for (Field f : field) {
                list.add(validateObject(f, object));
            }
        }
        return list;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private boolean validateObject(Field f, Object object) {
        Annotation[] annotation=f.getAnnotations();
        for(Annotation a:annotation){

        }
        return true;
    }
}
