package services;

import helper.Operations;
import helper.ZodiacInfo;
import io.grpc.stub.StreamObserver;
import proto.ZodiacGrpc;
import proto.ZodiacOuterClass;

import java.util.ArrayList;
import java.util.List;

public class ZodiacImpl extends ZodiacGrpc.ZodiacImplBase {
    private List<ZodiacInfo> zodiacList;
    private Operations operations;

    @Override
    public void getZodiac(ZodiacOuterClass.DateRequest request, StreamObserver<ZodiacOuterClass.ZodiacReply> responseObserver) {
        zodiacList = new ArrayList<>();
        operations = new Operations();

        operations.getZodiacTable(zodiacList);
        ZodiacOuterClass.ZodiacReply reply;
        if (request.getIsValid() == false) {
            reply = ZodiacOuterClass.ZodiacReply.newBuilder().setZodiac("Invalid birth date!").build();
        } else {
            reply = ZodiacOuterClass.ZodiacReply.newBuilder().setZodiac(operations.getZodiacForDate(request.getDate(), zodiacList)).build();
        }
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
