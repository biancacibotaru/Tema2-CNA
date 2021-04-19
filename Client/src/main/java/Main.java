import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.ZodiacGrpc;
import proto.ZodiacOuterClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Main {
    public static boolean isValid(String birthDate){
        try {
            LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("M/d/uuuu").withResolverStyle(ResolverStyle.STRICT));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String birthDate;
        Scanner scanner=new Scanner(System.in);
        birthDate=scanner.next();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();
        ZodiacGrpc.ZodiacBlockingStub bookStub = ZodiacGrpc.newBlockingStub(channel);
        ZodiacOuterClass.ZodiacReply reply = bookStub.getZodiac(ZodiacOuterClass.DateRequest.newBuilder().setDate(birthDate).setIsValid(isValid(birthDate)).build());
        System.out.println(reply.getZodiac());
        channel.shutdown();
    }
}
