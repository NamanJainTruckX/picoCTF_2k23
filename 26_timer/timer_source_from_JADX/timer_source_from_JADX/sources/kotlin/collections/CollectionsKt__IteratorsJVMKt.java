package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo14702d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0002¨\u0006\u0004"}, mo14703d2 = {"iterator", "", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, mo14704k = 5, mo14705mv = {1, 6, 0}, mo14707xi = 49, mo14708xs = "kotlin/collections/CollectionsKt")
/* compiled from: IteratorsJVM.kt */
class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt {
    public static final <T> Iterator<T> iterator(Enumeration<T> $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return new CollectionsKt__IteratorsJVMKt$iterator$1($this$iterator);
    }
}
