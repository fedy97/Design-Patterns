package behavioral.visitor;

/**
 * with this pattern we assume we will not implement other Segments,
 * but only new filters on the segments. In this way our code will comply with
 * open-close principle.
 * Overloading used in the apply method.
 */

public class Demo {
    public static void show() {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
    }
}
