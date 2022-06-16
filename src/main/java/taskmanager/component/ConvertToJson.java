package taskmanager.component;

import com.google.gson.Gson;
import taskmanager.entities.Task;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class  ConvertToJson {


    public static void ToJson(List<Task> taskData)
    {
        String path = "src/main/java/taskmanager/data/data.json";
        Gson gson = new Gson();
        String objectBankToJson = gson.toJson(taskData);

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(objectBankToJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
