package com.demo.demo1.director;

import com.demo.demo1.builder.impl.BMWBuilder;
import com.demo.demo1.builder.impl.BenzBuilder;
import com.demo.demo1.model.impl.BMWModel;
import com.demo.demo1.model.impl.BenzModel;

import java.util.List;
import java.util.Vector;

public class Director {

    private List<String> sequence = new Vector<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }


}
