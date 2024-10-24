package PruebaWindowBuilder;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagenFondo {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImagenFondo window = new ImagenFondo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ImagenFondo() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(createContenPanelConFondo());
	}

	private Component createContenPanelConFondo() {

		final Image imagenFondo = requestImage();

		JPanel miPanel = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);

				int W = frame.getWidth();
				int H = frame.getHeight();

				g.drawImage(imagenFondo, 0, 0, W, H, null);

			}

		};

		miPanel.setSize(500, 333);

		return miPanel;
	}

	private Image requestImage() {

		BufferedImage imagenFondo = null;
		try {
			imagenFondo = ImageIO.read(new File("src/PruebaWindowBuilder/imagen.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imagenFondo;
	}

}
/*
 * package PruebaWindowBuilder; import java.awt.Component; import
 * java.awt.EventQueue; import java.awt.Graphics; import java.awt.Image; import
 * java.awt.image.BufferedImage; import java.io.File; import
 * java.io.IOException; import javax.imageio.ImageIO; import javax.swing.JFrame;
 * import javax.swing.JPanel;
 * 
 * public class ImagenFondo {
 * 
 * private JFrame frame;
 * 
 * public static void main(String[] args) { EventQueue.invokeLater(() -> { try {
 * ImagenFondo window = new ImagenFondo(); window.frame.setVisible(true); }
 * catch (Exception e) { e.printStackTrace(); } }); }
 * 
 * public ImagenFondo() { initialize(); }
 * 
 * private void initialize() { frame = new JFrame(); frame.setBounds(100, 100,
 * 450, 300); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * frame.getContentPane().add(createContenPanelConFondo()); }
 * 
 * private Component createContenPanelConFondo() { final Image imagenFondo =
 * requestImage();
 * 
 * JPanel miPanel = new JPanel() {
 * 
 * @Override protected void paintComponent(Graphics g) {
 * super.paintComponent(g); // Obtener el tamaño del panel int panelWidth =
 * getWidth(); int panelHeight = getHeight();
 * 
 * // Obtener el tamaño de la imagen int imgWidth = imagenFondo.getWidth(null);
 * int imgHeight = imagenFondo.getHeight(null);
 * 
 * // Calcular la escala para cubrir el panel double scaleWidth = (double)
 * panelWidth / imgWidth; double scaleHeight = (double) panelHeight / imgHeight;
 * double scale = Math.max(scaleWidth, scaleHeight); // Usar max para cubrir
 * 
 * int newWidth = (int) (imgWidth * scale); int newHeight = (int) (imgHeight *
 * scale);
 * 
 * // Calcular la posición para centrar la imagen int x = (panelWidth -
 * newWidth) / 2; int y = (panelHeight - newHeight) / 2;
 * 
 * // Dibujar la imagen redimensionada y centrada g.drawImage(imagenFondo, x, y,
 * newWidth, newHeight, null); } };
 * 
 * return miPanel; }
 * 
 * private Image requestImage() { BufferedImage imagenFondo = null; try {
 * imagenFondo = ImageIO.read(new File("src/PruebaWindowBuilder/imagen.jpg")); }
 * catch (IOException e) { e.printStackTrace(); } return imagenFondo; } }
 */