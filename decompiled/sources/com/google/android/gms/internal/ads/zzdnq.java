package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnq extends zzcse {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfy zze;
    private final zzdde zzf;
    private final zzcwv zzg;
    private final zzcyc zzh;
    private final zzcsy zzi;
    private final zzbvt zzj;
    private final zzfln zzk;
    private final zzfbt zzl;
    private boolean zzm;

    zzdnq(zzcsd zzcsdVar, Context context, zzcfi zzcfiVar, zzdfy zzdfyVar, zzdde zzddeVar, zzcwv zzcwvVar, zzcyc zzcycVar, zzcsy zzcsyVar, zzfbe zzfbeVar, zzfln zzflnVar, zzfbt zzfbtVar) {
        super(zzcsdVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdfyVar;
        this.zzd = new WeakReference(zzcfiVar);
        this.zzf = zzddeVar;
        this.zzg = zzcwvVar;
        this.zzh = zzcycVar;
        this.zzi = zzcsyVar;
        this.zzk = zzflnVar;
        zzbvp zzbvpVar = zzfbeVar.zzm;
        this.zzj = new zzbwn(zzbvpVar != null ? zzbvpVar.zza : "", zzbvpVar != null ? zzbvpVar.zzb : 1);
        this.zzl = zzfbtVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfi zzcfiVar = (zzcfi) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgD)).booleanValue()) {
                if (!this.zzm && zzcfiVar != null) {
                    zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnp
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

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvt zzc() {
        return this.zzj;
    }

    public final zzfbt zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfi zzcfiVar = (zzcfi) this.zzd.get();
        return (zzcfiVar == null || zzcfiVar.zzaB()) ? false : true;
    }

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
    public final boolean zzh(boolean z, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc)) {
                zzcaa.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaC)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzcaa.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfdb.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdfx e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
