package school;

import java.rmi.*;
import java.util.*;

public interface StudentManager extends Remote {
    List<StudentEntity> fetchInfo(int rollNo) throws RemoteException;
}