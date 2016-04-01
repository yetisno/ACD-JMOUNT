package org.yetiz.util.acdjm.fuse;

import net.fusejna.FuseException;
import org.yetiz.util.acdjm.exception.ACDJMException;

import java.io.IOException;

/**
 * Created by yeti on 2016/4/1.
 */
public class JNAFuseService implements FuseService {
    private JNAFuseFileSystem file_system;
    private String mount_point;
    private boolean logging;

    public JNAFuseService(String mount_point, boolean logging) {
        this.mount_point = mount_point;
        this.logging = logging;
    }

    public void mount() {
        file_system = new JNAFuseFileSystem(this.logging);
        try {
            file_system.mount(this.mount_point);
        } catch (FuseException e) {
            throw new ACDJMException(e);
        }
    }

    public void unmount() {
        if (file_system != null && file_system.isMounted()) {
            try {
                file_system.unmount();
            } catch (IOException | FuseException e) {
                throw new ACDJMException(e);
            }
        }
    }
}
