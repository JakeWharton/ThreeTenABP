# Keep class members used for serialization
# https://www.guardsquare.com/en/products/proguard/manual/examples#serializable
-keepclassmembers class org.threeten.bp.** implements java.io.Serializable {
  private static final java.io.ObjectStreamField[] serialPersistentFields;
  private void writeObject(java.io.ObjectOutputStream);
  private void readObject(java.io.ObjectInputStream);
  java.lang.Object writeReplace();
  java.lang.Object readResolve();
}
