object Examenbigdata {
  def fonctionListe(list:List[String]):List[String] = {
    val liste: List[String]  = List("julien", "paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")
    val liste1 = liste.filter(e => e.endsWith("n"))
    return liste1
  }
  def main(args: Array[String]): Unit = {
    liste_double()
    val t = fonctionListe(List("julien", "paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice"))
  t.foreach(e=>println(e))
  }

  def liste_double():Unit={
    val states=Map(
      "ecommercemag.fr"->"",
      "http://www.journalducm.com/contact/"->"payant",
    " http://www.zatsaz.com/"->"",
    "http://www.lerevenu.com/"->"",
    "http://www.cadre-dirigfant-magasin.com/"->"payant",
    "http://www.silicom.fr/services/contact#annoncer"->"payant",
    "http://www.changebilcadre-dirigfant-magasin.com/"->"payant"
    )

  }
  //13
  def nouvelle(){
    val sta=Map(
      "ecommercemag.fr"->"",
      "http://www.journalducm.com/contact/"->"payant",
    " http://www.zatsaz.com/"->"",
    "http://www.lerevenu.com/"->"",
    "http://www.cadre-dirigfant-magasin.com/"->"payant",
    "http://www.silicom.fr/services/contact#annoncer"->"payant",
    "http://www.changebilcadre-dirigfant-magasin.com/"->"payant"
    )
    sta.map(l => {
      if (l._1.startsWith("https://www.")){l._1.substring(12) }
      else{ l._1}
    }).foreach(l =>println(l))


  }

}
