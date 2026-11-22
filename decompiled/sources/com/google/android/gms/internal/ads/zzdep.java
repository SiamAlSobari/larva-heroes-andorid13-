package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdep extends zzcse {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdde zze;
    private final zzdfy zzf;
    private final zzcsy zzg;
    private final zzfln zzh;
    private final zzcwv zzi;
    private final zzbzn zzj;
    private boolean zzk;

    zzdep(zzcsd zzcsdVar, Context context, @Nullable zzcfi zzcfiVar, zzdde zzddeVar, zzdfy zzdfyVar, zzcsy zzcsyVar, zzfln zzflnVar, zzcwv zzcwvVar, zzbzn zzbznVar) {
        super(zzcsdVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfiVar);
        this.zze = zzddeVar;
        this.zzf = zzdfyVar;
        this.zzg = zzcsyVar;
        this.zzh = zzflnVar;
        this.zzi = zzcwvVar;
        this.zzj = zzbznVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfi zzcfiVar = (zzcfi) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgD)).booleanValue()) {
                if (!this.zzk && zzcfiVar != null) {
                    zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdeo
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfiVar.destroy();
                        }
                    });
                }
            } else if (zzcfiVar != null) {
                zzcfiVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        Context context;
        zzfbe zzfbeVarZzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc)) {
                zzcaa.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaC)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
            } else {
                zzcfi zzcfiVar = (zzcfi) this.zzd.get();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkC)).booleanValue() || zzcfiVar == null || (zzfbeVarZzD = zzcfiVar.zzD()) == null || !zzfbeVarZzD.zzar || zzfbeVarZzD.zzas == this.zzj.zzb()) {
                    if (this.zzk) {
                        zzcaa.zzj("The interstitial ad has been shown.");
                        this.zzi.zza(zzfdb.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzk) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        try {
                            this.zzf.zza(z, context, this.zzi);
                            this.zze.zza();
                            this.zzk = true;
                            return true;
                        } catch (zzdfx e) {
                            this.zzi.zzc(e);
                        }
                    }
                } else {
                    zzcaa.zzj("The interstitial consent form has been shown.");
                    this.zzi.zza(zzfdb.zzd(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            zzcfi zzcfiVar2 = (zzcfi) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkC)).booleanValue()) {
                if (this.zzk) {
                    zzcaa.zzj("The interstitial ad has been shown.");
                    this.zzi.zza(zzfdb.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            } else {
                if (this.zzk) {
                    zzcaa.zzj("The interstitial ad has been shown.");
                    this.zzi.zza(zzfdb.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            }
        }
        return false;
    }
}
