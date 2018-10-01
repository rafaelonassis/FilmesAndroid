package sin.multiprog.usjt.br.meusfilmes;

public class FilmeDAO {
    private static Filme[] filmes;

    private FilmeDAO(){

    }

    public static Filme[] getFilmes(){
        if(filmes == null){

            filmes = new Filme[9];
            filmes[0] = new Filme(11,"Clube da Luta","David Fincher","Jack (Edward Norton) é um executivo jovem, trabalha como investigador de seguros, mora confortavelmente, mas ele está ficando cada vez mais insatisfeito com sua vida medíocre. " + "Para piorar ele está enfrentando uma terrível crise de insônia, até que encontra uma cura inusitada para o sua falta de sono ao frequentar grupos de auto-ajuda. Nesses encontros ele passa a conviver com pessoas problemáticas como a viciada Marla Singer (Helena Bonham Carter) e a conhecer estranhos como Tyler Durden (Brad Pitt). " + "Misterioso e cheio de ideias, Tyler apresenta para Jack um grupo secreto que se encontra para extravasar suas angústias e tensões através de violentos combates corporais.","50","29/10/1999","clubedaluta.png");
            filmes[1] = new Filme(1,"Harry Potter a pedra filosofal ","Chris Columbus ","Conheça Harry Potter, um menino que soube em seu aniversário de onze anos que é filho órfão de dois bruxos e possui poderes mágicos únicos. De filho indesejado, passa a ser um estudante de Hogwarts, uma escola inglesa para bruxos. Lá ele conhece vários amigos que o ajudam a descobrir a verdade sobre as mortes misteriosas de seus pais.","96", "23/11/2001", "harrypotter1.png");
            filmes[2] = new Filme(9,"A Freira","Corin Hardy","Presa em um convento na Romênia, uma freira comete suicídio. Para investigar o caso, o Vaticano envia um padre assombrado e uma noviça prestes a se tornar freira. Arriscando suas vidas, a fé e até suas almas, os dois descobrem um segredo profano e se confrontam com uma força do mal que toma a forma de uma freira demoníaca e transforma o convento em um campo de batalha.","85","06/09/2018", "afreira.png");
            filmes[3] = new Filme(10,"Três Homens em Conflito","Sergio Leone","Em meio à Guerra Civil Americana, três homens fazem de tudo para colocar as mãos em 200 mil dólares roubados.","46","17/04/1976","treshomensemconflito.png");
            filmes[4] = new Filme(11,"Clube da Luta","David Fincher","Jack (Edward Norton) é um executivo jovem, trabalha como investigador de seguros, mora confortavelmente, mas ele está ficando cada vez mais insatisfeito com sua vida medíocre. " + "Para piorar ele está enfrentando uma terrível crise de insônia, até que encontra uma cura inusitada para o sua falta de sono ao frequentar grupos de auto-ajuda. Nesses encontros ele passa a conviver com pessoas problemáticas como a viciada Marla Singer (Helena Bonham Carter) e a conhecer estranhos como Tyler Durden (Brad Pitt). " + "Misterioso e cheio de ideias, Tyler apresenta para Jack um grupo secreto que se encontra para extravasar suas angústias e tensões através de violentos combates corporais.","50","29/10/1999","clubedaluta.png");
            filmes[5] = new Filme(12,"Forrest Gump: O Contador de Histórias"," Robert Zemeckis","Quarenta anos da história dos Estados Unidos, vistos pelos olhos de Forrest Gump (Tom Hanks), um rapaz com QI abaixo da média e boas intenções." + " Por obra do acaso, ele consegue participar de momentos cruciais, como a Guerra do Vietnã e Watergate, mas continua pensando no seu amor de infância, Jenny Curran.","100","07/12/1994","forrestgump.png");
            filmes[6] = new Filme(13,"Star Wars: Episódio IV - Uma Nova Esperança","George Lucas","Luke Skywalker (Mark Hammil) sonha ir para a Academia como seus amigos, mas se vê envolvido em uma guerra intergalática quando seu tio compra dois robôs e com eles encontra uma mensagem da princesa Leia Organa (Carrie Fisher) para o jedi Obi-Wan Kenobi (Alec Guiness) sobre os planos da construção da Estrela da Morte, uma gigantesca estação espacial com capacidade para destruir um planeta." + " Luke então se junta aos cavaleiros jedi e a Hans Solo (Harrison Ford), um mercenário, para tentar destruir esta terrível ameaça ao lado dos membros da resistência.","60","30/01/1978","umanovaesperanca.png");
            filmes[7] = new Filme(14,"Deadpool 2","David Leitch","Quando o super soldado Cable (Josh Brolin) chega em uma missão para assassinar o jovem mutante Russel (Julian Dennison), o mercenário Deadpool (Ryan Reynolds) precisa aprender o que é ser herói de verdade para salvá-lo. " + "Para isso, ele recruta seu velho amigo Colossus e forma o novo grupo X-Force, sempre com o apoio do fiel escudeiro Dopinder (Karan Soni).","65","17/05/2018","deadpool2.png");
            filmes[8] = new Filme(15,"Deadpool","Tim Miller","Wade Wilson é um ex-agente especial que passou a trabalhar como mercenário. Seu mundo é destruído quando um cientista maligno o tortura e o desfigura completamente. O experimento brutal transforma Wade em Deadpool, que ganha poderes especiais de cura e uma força aprimorada. Com a ajuda de aliados poderosos e um senso de humor mais desbocado e cínico do que nunca, o irreverente anti-herói usa habilidades e métodos violentos para se vingar do homem que quase acabou com a sua vida." ,"94","11/02/2016", "deadpool.png");
        }

        return filmes;
    }

}
