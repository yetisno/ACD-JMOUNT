package org.yetiz.util.acdjm.fuse;

import net.fusejna.*;
import net.fusejna.types.TypeMode;
import net.fusejna.util.FuseFilesystemAdapterFull;

import java.io.File;
import java.nio.ByteBuffer;

/**
 * Created by yeti on 2016/4/1.
 */
public class JNAFuseFileSystem extends FuseFilesystemAdapterFull {
    protected JNAFuseFileSystem(boolean logging) {
        this.log(logging);
    }

    @Override
    public int access(String path, int access) {
        return super.access(path, access);
    }

    @Override
    public void afterUnmount(File mountPoint) {
        super.afterUnmount(mountPoint);
    }

    @Override
    public void beforeMount(File mountPoint) {
        super.beforeMount(mountPoint);
    }

    @Override
    public int bmap(String path, StructFuseFileInfo.FileInfoWrapper info) {
        return super.bmap(path, info);
    }

    @Override
    public int chmod(String path, TypeMode.ModeWrapper mode) {
        return super.chmod(path, mode);
    }

    @Override
    public int chown(String path, long uid, long gid) {
        return super.chown(path, uid, gid);
    }

    @Override
    public int create(String path, TypeMode.ModeWrapper mode, StructFuseFileInfo.FileInfoWrapper info) {
        return super.create(path, mode, info);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public int fgetattr(String path, StructStat.StatWrapper stat, StructFuseFileInfo.FileInfoWrapper info) {
        return super.fgetattr(path, stat, info);
    }

    @Override
    public int flush(String path, StructFuseFileInfo.FileInfoWrapper info) {
        return super.flush(path, info);
    }

    @Override
    public int fsync(String path, int datasync, StructFuseFileInfo.FileInfoWrapper info) {
        return super.fsync(path, datasync, info);
    }

    @Override
    public int fsyncdir(String path, int datasync, StructFuseFileInfo.FileInfoWrapper info) {
        return super.fsyncdir(path, datasync, info);
    }

    @Override
    public int ftruncate(String path, long offset, StructFuseFileInfo.FileInfoWrapper info) {
        return super.ftruncate(path, offset, info);
    }

    @Override
    public int getattr(String path, StructStat.StatWrapper stat) {
        return super.getattr(path, stat);
    }

    @Override
    protected String getName() {
        return super.getName();
    }

    @Override
    protected String[] getOptions() {
        return super.getOptions();
    }

    @Override
    public int getxattr(String path, String xattr, XattrFiller filler, long size, long position) {
        return super.getxattr(path, xattr, filler, size, position);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public int link(String path, String target) {
        return super.link(path, target);
    }

    @Override
    public int listxattr(String path, XattrListFiller filler) {
        return super.listxattr(path, filler);
    }

    @Override
    public int lock(String path, StructFuseFileInfo.FileInfoWrapper info, FlockCommand command, StructFlock.FlockWrapper flock) {
        return super.lock(path, info, command, flock);
    }

    @Override
    public int mkdir(String path, TypeMode.ModeWrapper mode) {
        return super.mkdir(path, mode);
    }

    @Override
    public int mknod(String path, TypeMode.ModeWrapper mode, long dev) {
        return super.mknod(path, mode, dev);
    }

    @Override
    public int open(String path, StructFuseFileInfo.FileInfoWrapper info) {
        return super.open(path, info);
    }

    @Override
    public int opendir(String path, StructFuseFileInfo.FileInfoWrapper info) {
        return super.opendir(path, info);
    }

    @Override
    public int read(String path, ByteBuffer buffer, long size, long offset, StructFuseFileInfo.FileInfoWrapper info) {
        return super.read(path, buffer, size, offset, info);
    }

    @Override
    public int readdir(String path, DirectoryFiller filler) {
        return super.readdir(path, filler);
    }

    @Override
    public int readlink(String path, ByteBuffer buffer, long size) {
        return super.readlink(path, buffer, size);
    }

    @Override
    public int release(String path, StructFuseFileInfo.FileInfoWrapper info) {
        return super.release(path, info);
    }

    @Override
    public int releasedir(String path, StructFuseFileInfo.FileInfoWrapper info) {
        return super.releasedir(path, info);
    }

    @Override
    public int removexattr(String path, String xattr) {
        return super.removexattr(path, xattr);
    }

    @Override
    public int rename(String path, String newName) {
        return super.rename(path, newName);
    }

    @Override
    public int rmdir(String path) {
        return super.rmdir(path);
    }

    @Override
    public int setxattr(String path, String xattr, ByteBuffer buf, long size, int flags, int position) {
        return super.setxattr(path, xattr, buf, size, flags, position);
    }

    @Override
    public int statfs(String path, StructStatvfs.StatvfsWrapper wrapper) {
        return super.statfs(path, wrapper);
    }

    @Override
    public int symlink(String path, String target) {
        return super.symlink(path, target);
    }

    @Override
    public int truncate(String path, long offset) {
        return super.truncate(path, offset);
    }

    @Override
    public int unlink(String path) {
        return super.unlink(path);
    }

    @Override
    public int utimens(String path, StructTimeBuffer.TimeBufferWrapper wrapper) {
        return super.utimens(path, wrapper);
    }

    @Override
    public int write(String path, ByteBuffer buf, long bufSize, long writeOffset, StructFuseFileInfo.FileInfoWrapper wrapper) {
        return super.write(path, buf, bufSize, writeOffset, wrapper);
    }
}
