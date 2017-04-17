package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloLambda implements RequestHandler<RequestValue, ExampleResponse>{



    public ExampleResponse handleRequest(RequestValue request, Context context) {

        String time = LocalDateTime.now().format(DateTimeFormatter.ISO_TIME);
        String greetingString = String.format("Hello your request was processed at %s, input value:%s", time,request.getValue());
        return new ExampleResponse(greetingString);
    }


}