package net.idik.lib.cipher.so;

import java.lang.IllegalAccessException;
import java.lang.String;

public final class CipherClient {
  private CipherClient() throws IllegalAccessException {
    throw new IllegalAccessException();
  }

  public static final String leancloudId() {
    return CipherCore.get("bea6cf8d39ba1356e1bcfd461a0d187a");
  }

  public static final String leancloudKey() {
    return CipherCore.get("5460975f21e6ddbfc9e94dee416cbaac");
  }
}
