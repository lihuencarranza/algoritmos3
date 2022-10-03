package POO.ej3;

public class Mensaje {
        private Usuario emisor;
        private Usuario receptor;
        private String texto;

        public Mensaje(Usuario usuario, Usuario receptor, String texto) {
                this.emisor = usuario;
                this.receptor = receptor;
                this.texto = texto;
        }

        public Usuario getEmisor() {
                return emisor;
        }

        public Usuario getReceptor() {
                return receptor;
        }

        public String getTexto() {
                return texto;
        }
}
