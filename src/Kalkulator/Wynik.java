import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class Wynik {
    public static String Wynik(String dane) throws Exception {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine scriptEngine = sem.getEngineByName("JavaScript");
        String x = dane;
        return scriptEngine.eval(x).toString();
    }
}